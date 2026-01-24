package repository;

import model.Cartoon;
import utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CartoonRepository {

    // Создать новый мультфильм
    public void create(Cartoon cartoon) {
        String sql = "INSERT INTO cartoon (name, episodes, studio) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cartoon.getName());
            ps.setInt(2, cartoon.getEpisodes());
            ps.setString(3, cartoon.getStudio());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Не получается создать мультик", e);
        }
    }

    // Получить все мультфильмы
    public List<Cartoon> getAll() {
        List<Cartoon> cartoons = new ArrayList<>();
        String sql = "SELECT * FROM cartoon";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cartoon cartoon = new Cartoon();
                cartoon.setId(rs.getInt("id"));
                cartoon.setName(rs.getString("name"));
                cartoon.setEpisodes(rs.getInt("episodes"));
                cartoon.setStudio(rs.getString("studio"));
                cartoons.add(cartoon);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Ошибка при получении данных", e);
        }

        return cartoons;
    }

    // Найти мультфильм по id
    public Cartoon findById(int id) {
        String sql = "SELECT * FROM cartoon WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Cartoon cartoon = new Cartoon();
                    cartoon.setId(rs.getInt("id"));
                    cartoon.setName(rs.getString("name"));
                    cartoon.setEpisodes(rs.getInt("episodes"));
                    cartoon.setStudio(rs.getString("studio"));
                    return cartoon;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("Ошибка при поиске по id", e);
        }

        return null;
    }

    // Обновить мультфильм по id
    public void update(int id, Cartoon cartoon) {
        String sql = "UPDATE cartoon SET name = ?, episodes = ?, studio = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cartoon.getName());
            ps.setInt(2, cartoon.getEpisodes());
            ps.setString(3, cartoon.getStudio());
            ps.setInt(4, id);

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Ошибка при обновлении мультика", e);
        }
    }

    // Удалить мультфильм по id
    public void delete(int id) {
        String sql = "DELETE FROM cartoon WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Не удаляется", e);
        }
    }
}
