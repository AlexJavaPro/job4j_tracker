package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getUsername())) {
                result = users[i];
            }
        }
        if (result == null) {
            new UserNotFoundException();
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() && user.getUsername().length() < 3) {
            new UserInvalidException();
        }
        return user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("Пользователь не валидный");
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            System.out.println("Пользователь не найден");
            e.printStackTrace();
        }
    }
}