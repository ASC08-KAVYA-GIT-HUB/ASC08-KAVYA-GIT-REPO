package org.example.repository;
import org.example.model.Friend;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FriendRepositoryImpl implements FriendRepository {

    private Connection getConnection() {
        return FriendDbConnection.getInstance();
    }

    @Override
    public boolean addFriend(Friend friend) {
        Connection conn = FriendDbConnection.getInstance();

        try {
            // 1. Get latest ID
            String query = "SELECT MAX(id) FROM friend";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            String newId = "f001";  // default
            if (rs.next() && rs.getString(1) != null) {
                String lastId = rs.getString(1); // e.g., "f005"
                int num = Integer.parseInt(lastId.substring(1)); // extract 5
                num++;
                newId = String.format("f%03d", num); // format to f006, etc.
            }

            else {
                newId = "F001";
            }

            // 2. Set the new ID
            friend.setId(newId);

            // 3. Insert into DB
            String insertQuery = "INSERT INTO friend (id, name, email, phone, city) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setString(1, friend.getId());
            pstmt.setString(2, friend.getName());
            pstmt.setString(3, friend.getEmail());
            pstmt.setString(4, friend.getPhone());
            pstmt.setString(5, friend.getCity());

            int rowsInserted = pstmt.executeUpdate();
            return rowsInserted > 0;

        } catch (SQLException e) {
            System.out.println("Error inserting friend: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Friend> getAllFriends() {
        List<Friend> friends = new ArrayList<>();
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM friend");

            while (rs.next()) {
                friends.add(new Friend(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("city")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return friends;
    }

    @Override

    public boolean updateFriend(String id, String fieldName, String newValue) {
        Connection conn = getConnection();
        String sql = "UPDATE friend SET " + fieldName + " = ? WHERE id = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newValue);
            pstmt.setString(2, id);
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            System.out.println("Error while updating: " + e.getMessage());
            return false;
        }
    }
//if try with resource used , it automatically closes the pstmt after usage

    @Override
    public boolean deleteFriend(String id) {
        try {
            Connection conn = getConnection();
            String deleteQuery = "DELETE FROM friend WHERE id=?";
            PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
            pstmt.setString(1, id);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}




