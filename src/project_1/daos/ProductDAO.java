package project_1.daos;

import db_connection.ConnectionFactory;
import project_1.classes.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDAO {

    public static void selectAll(){
        Connection connection = ConnectionFactory.getConnection("products_db");
        String sqlCommand = "select `id`, `name`, `description`, `quantity`, `price` from `products_db`.`product`;";

        try(Statement stm = connection.createStatement()){
            ResultSet resultSet = stm.executeQuery(sqlCommand);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");

                System.out.println("Produto: " + id + ", " + name + ", " + description + ", " + quantity + ", R$ " + price);
            }
        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    public static void select(int _id){
        Connection connection = ConnectionFactory.getConnection("products_db");
        String sqlCommand = "select `id`, `name`, `description`, `quantity`, `price` from `products_db`.`product` where `id` = '" + _id + "';";

        try(Statement stm = connection.createStatement()){
            ResultSet resultSet = stm.executeQuery(sqlCommand);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("price");

                System.out.println("Produto: " + id + ", " + name + ", " + description + ", " + quantity + ", R$ " + price);
            }
        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    public static void save(Product product){
        Connection connection = ConnectionFactory.getConnection("products_db");
        String sqlCommand = "insert into `products_db`.`product` (`id`, `name`, `description`, `quantity`, `price`) values ('" + product.getId() + "', '" + product.getName() + "', '" + product.getDescription() + "', '" + product.getQuantity() + "', '" + product.getPrice()+ "');";

        try {
            Statement stm = connection.createStatement();
            if(stm != null){
                System.out.println(stm.executeUpdate(sqlCommand));
                connection.close();
                System.out.println("Produto adicionado com sucesso!");
            }
        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    public static void update(Product product){
        Connection connection = ConnectionFactory.getConnection("products_db");
        String sqlCommand = "update `products_db`.`product` set `name` = '" + product.getName() + "', `description` = '" + product.getDescription() + "', `quantity` = '" + product.getQuantity() + "', `price` = '" + product.getPrice()+ "' where (`id` = '" + product.getId() + "');";

        if(product == null || product.getId() == 0){
            System.out.println("Registro inexistente...");
            return;
        }

        try {
            Statement stm = connection.createStatement();
            if(stm != null){
                System.out.println(stm.executeUpdate(sqlCommand));
                connection.close();
                System.out.println("Produto atualizado com sucesso!");
            }
        } catch (SQLException exception){
            exception.printStackTrace();
        }

    }

    public static void delete(Product product){
        Connection connection = ConnectionFactory.getConnection("products_db");
        String sqlCommand = "delete from `products_db`.`product` where (`id` = '" + product.getId() + "');";

        if(product == null || product.getId() == 0){
            System.out.println("Registro inexistente...");
            return;
        }

        try {
            Statement stm = connection.createStatement();
            if(stm != null){
                System.out.println(stm.executeUpdate(sqlCommand));
                connection.close();
                System.out.println("Produto deletado com sucesso!");
            }
            else {
                System.out.println("Não foi possivel deletar o produto... Statement retornando nulo!");
            }
        } catch (SQLException exception){
            exception.printStackTrace();
        }

    }
}
