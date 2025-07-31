package org.example.ui;
import java.util.List;
import org.example.model.Friend;
import org.example.repository.FriendRepository;
import org.example.repository.FriendRepositoryImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FriendRepository friendRepository = new FriendRepositoryImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create\n2. Read\n3. Update\n4. Delete\n5. Exit\nEnter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println("Enter email:");
                    String email = sc.nextLine();
                    System.out.println("Enter phone:");
                    String phone = sc.nextLine();
                    System.out.println("Enter city:");
                    String city = sc.nextLine();
                    Friend newFriend = new Friend(name, email, phone, city);
                    if (friendRepository.addFriend(newFriend))
                        System.out.println("Friend added.");
                    else
                        System.out.println("Failed to add friend.");
                    break;
                case 2:
                    List<Friend> friends = friendRepository.getAllFriends();
                    for (Friend f : friends) System.out.println(f);
                    break;
                case 3:
                    System.out.println("Enter ID to update:");
                    String uid = sc.nextLine();
                    System.out.println("Enter new name:");
                    name = sc.nextLine();
                    System.out.println("Enter new email:");
                    email = sc.nextLine();
                    System.out.println("Enter new phone:");
                    phone = sc.nextLine();
                    System.out.println("Enter new city:");
                    city = sc.nextLine();
                    Friend updateFriend = new Friend(uid, name, email, phone, city);
                    if (friendRepository.updateFriend(updateFriend))
                        System.out.println("Friend updated.");
                    else
                        System.out.println("Update failed.");
                    break;
                case 4:
                    System.out.println("Enter ID to delete:");
                    String did = sc.nextLine();
                    if (friendRepository.deleteFriend(did))
                        System.out.println("Friend deleted.");
                    else
                        System.out.println("Delete failed.");
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
