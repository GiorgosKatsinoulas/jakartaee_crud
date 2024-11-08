package gkats.jakarta;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;


import java.util.List;

@Named("helloBean")
@RequestScoped
public class HelloBean {
    private String message;
    private String password;
    private String selectedOption;
    private String field1;
    private String field2;
    private int amount;
    private List<User> users; // Assuming you have a User class
    private String selectedDate;

    // Constructor
    public HelloBean() {
        // Initialize users list
        users = List.of(
            new User("John Doe", "john@example.com"),
            new User("Jane Smith", "jane@example.com")
        );

    }

    // Getters and Setters
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getSelectedOption() { return selectedOption; }
    public void setSelectedOption(String selectedOption) { this.selectedOption = selectedOption; }

    public String getField1() { return field1; }
    public void setField1(String field1) { this.field1 = field1; }

    public String getField2() { return field2; }
    public void setField2(String field2) { this.field2 = field2; }

    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public List<User> getUsers() { return users; }
    public void setUsers(List<User> users) { this.users = users; }



    public String getSelectedDate() { return selectedDate; }
    public void setSelectedDate(String selectedDate) { this.selectedDate = selectedDate; }

    // Actions
    public void submit() {
        // Handle the submission action
        System.out.println("Message: " + message);
    }

    public void deleteUser(User user) {
        // Handle user deletion
        users.remove(user);
    }

    // User class to hold data for dataTable
    public static class User {
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        // Getters and Setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }
}
