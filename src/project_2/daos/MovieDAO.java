package project_2.daos;

import db_connection.ConnectionFactory;
import project_2.classes.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MovieDAO {
    public static ArrayList<Movie> selectMovies() throws SQLException {
        ArrayList<Movie> movies = new ArrayList<>();
        String sqlCommand = "select * from movies";

        try (

                Connection connection = ConnectionFactory.getConnection("movies_db");
                PreparedStatement prepStatement = connection.prepareStatement(sqlCommand);
                ResultSet resultSet = prepStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                Movie movie = new Movie();
                movie.setId(resultSet.getInt("id"));
                movie.setName(resultSet.getString("name"));
                movie.setDescription(resultSet.getString("description"));
                movie.setYear(resultSet.getInt("year"));
                movies.add(movie);
            }
        }
        return movies;
    }
}
