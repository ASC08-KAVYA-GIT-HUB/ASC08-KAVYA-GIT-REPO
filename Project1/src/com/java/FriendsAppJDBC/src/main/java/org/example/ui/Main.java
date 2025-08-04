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

                    System.out.println("Which field do you want to update?");
                    System.out.println("1. Name\n2. Email\n3. Phone\n4. City");
                    int fieldChoice = sc.nextInt();
                    sc.nextLine(); // consume newline

                    String fieldName = "";
                    String newValue = "";

                    switch (fieldChoice) {
                        case 1:
                            fieldName = "name";
                            System.out.print("Enter new name: ");
                            break;
                        case 2:
                            fieldName = "email";
                            System.out.print("Enter new email: ");
                            break;
                        case 3:
                            fieldName = "phone";
                            System.out.print("Enter new phone: ");
                            break;
                        case 4:
                            fieldName = "city";
                            System.out.print("Enter new city: ");
                            break;
                        default:
                            System.out.println("Invalid choice");
                            return;
                    }

                    newValue = sc.nextLine();

                    if (friendRepository.updateFriend(uid, fieldName, newValue)) {
                        System.out.println("Friend updated successfully.");
                    } else {
                        System.out.println("Update failed.");
                    }
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
