package com.epam.javaIntro.storage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.epam.javaIntro.bean.Book;
import com.epam.javaIntro.bean.BookType;
import com.epam.javaIntro.bean.User;
import com.epam.javaIntro.bean.UserType;
import com.epam.javaIntro.builder.BookBuilder;
import com.epam.javaIntro.builder.UserBuilder;

public class TXTStorage {
	private static String usersFile = "resources/users.txt";
    private static String booksFile = "resources/books.txt";
    //private static String lettersFile = "resources/books.txt";
    
    public static ArrayList<User> loadUsers() {
    	String line;
        String splitBy = ",";
        ArrayList<User> users = new ArrayList<User>();
        try (BufferedReader br = new BufferedReader(new FileReader(usersFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                User user = new UserBuilder()
                			   .withId(Integer.parseInt(data[0]))
                			   .withUsername(data[1])
                			   .withLogin(data[2])
                			   .withPassword(data[3])
                			   .withEmail(data[4])
                			   .withUserType(UserType.valueOf(data[5].toUpperCase()))
                			   .build();   
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
    
    public static void saveUsers(ArrayList<User> users) {
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(usersFile))) {
            for (User user : users) {
                StringBuilder sb = new StringBuilder();
                sb.append(user.getId());
                sb.append(",");
                sb.append(user.getUsername());
                sb.append(",");
                sb.append(user.getLogin());
                sb.append(",");
                sb.append(user.getPassword());
                sb.append(",");
                sb.append(user.getEmail());
                sb.append(",");
                sb.append(user.getUserType().name().toLowerCase());
                bw.write(sb.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Book> loadBooks() {
        String line;
        String splitBy = ",";
        ArrayList<Book> books = new ArrayList<Book>();
        try (BufferedReader br = new BufferedReader(new FileReader(booksFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                Book book = new BookBuilder()
                			   .withName(data[0])
                			   .withAuthor(data[1])
                			   .withBookType(BookType.valueOf(data[2].toUpperCase()))
                			   .withPublicationYear(Integer.parseInt(data[3]))
                			   .build();
                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
    
    public static void saveBooks(ArrayList<Book> books) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(booksFile))) {
            for (Book book : books) {
                StringBuilder sb = new StringBuilder();
                sb.append(book.getName());
                sb.append(",");
                sb.append(book.getAuthor());
                sb.append(",");
                sb.append(book.getBookType().name().toLowerCase());
                sb.append(",");
                sb.append(book.getPublicationYear());
                bw.write(sb.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
