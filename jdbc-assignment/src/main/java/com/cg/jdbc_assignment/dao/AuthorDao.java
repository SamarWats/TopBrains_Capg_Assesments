package com.cg.jdbc_assignment.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.cg.jdbc_assignment.bean.Author;

public class AuthorDao implements IAuthorDao {

    @Override
    public String insertAuthor(Author author) {

        String sql = "INSERT INTO author(firstName,middleName,lastName,phoneNo) VALUES(?,?,?,?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, author.getFirstName());
            ps.setString(2, author.getMiddleName());
            ps.setString(3, author.getLastName());
            ps.setString(4, author.getPhoneNo());

            int rows = ps.executeUpdate();

            if (rows > 0)
                return "Author Inserted Successfully";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Insert Failed";
    }

    @Override
    public Author getAuthorById(int authorId) {

        String sql = "SELECT * FROM author WHERE authorId=?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, authorId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Author a = new Author(
                        rs.getString("firstName"),
                        rs.getString("middleName"),
                        rs.getString("lastName"),
                        rs.getString("phoneNo"));

                a.setAuthorId(rs.getInt("authorId"));

                return a;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String updateAuthorPhone(int authorId, String newPhone) {

        String sql = "UPDATE author SET phoneNo=? WHERE authorId=?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newPhone);
            ps.setInt(2, authorId);

            int rows = ps.executeUpdate();

            if (rows > 0)
                return "Author Updated Successfully";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Update Failed";
    }

    @Override
    public String deleteAuthor(int authorId) {

        String sql = "DELETE FROM author WHERE authorId=?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, authorId);

            int rows = ps.executeUpdate();

            if (rows > 0)
                return "Author Deleted Successfully";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Delete Failed";
    }

    @Override
    public List<Author> getAllAuthors() {

        List<Author> list = new ArrayList<>();

        String sql = "SELECT * FROM author";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Author a = new Author(
                        rs.getString("firstName"),
                        rs.getString("middleName"),
                        rs.getString("lastName"),
                        rs.getString("phoneNo"));

                a.setAuthorId(rs.getInt("authorId"));

                list.add(a);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}