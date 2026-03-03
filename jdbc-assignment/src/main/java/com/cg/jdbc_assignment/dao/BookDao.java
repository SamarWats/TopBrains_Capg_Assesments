package com.cg.jdbc_assignment.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cg.jdbc_assignment.bean.Book;

public class BookDao implements IBookDao {

    @Override
    public String insertBook(Book book) {

        String sql = "INSERT INTO book(title,price,authorId) VALUES(?,?,?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, book.getTitle());
            ps.setDouble(2, book.getPrice());
            ps.setInt(3, book.getAuthorId());

            int rows = ps.executeUpdate();

            if (rows > 0)
                return "Book Inserted Successfully";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Insert Failed";
    }

    @Override
    public List<String> getBooksByAuthorName(String firstName) {

        List<String> list = new ArrayList<>();

        String sql = "SELECT b.title FROM book b "
                   + "JOIN author a ON b.authorId = a.authorId "
                   + "WHERE a.firstName = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, firstName);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("title"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public String updateBookPriceByAuthor(String firstName, double newPrice) {

        String sql = "UPDATE book b "
                   + "JOIN author a ON b.authorId = a.authorId "
                   + "SET b.price = ? "
                   + "WHERE a.firstName = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, newPrice);
            ps.setString(2, firstName);

            int rows = ps.executeUpdate();

            if (rows > 0)
                return "Book Price Updated Successfully";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Update Failed";
    }
}