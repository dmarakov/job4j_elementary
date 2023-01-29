package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }
        }
        throw new UserInvalidException("Такого юзера не существует");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!(user.isValid()) || user.getUsername().length() < 3) {
            throw new UserInvalidException("Юзер не валидный");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("qw", true)
        };
        try {
            User user = findUser(users, "qw");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException a) {
            a.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
