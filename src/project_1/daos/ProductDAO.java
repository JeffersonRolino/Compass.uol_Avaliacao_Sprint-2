package project_1.daos;

import db_connection.ConnectionFactory;
import project_1.classes.Product;

import java.sql.*;
import java.util.PrimitiveIterator;

public class ProductDAO {

    // Comando para retornar os últimos 3 produtos do product_db.product:
    //      SELECT * FROM products_db.product ORDER BY id DESC LIMIT 3;
    public static void selectLastThree(){
        Connection connection = ConnectionFactory.getConnection("products_db");
        String sqlCommand = "select * from `products_db`.`product` order by `id` desc limit 3;";

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

    public static int[] selectLastThreeIDs(){
        Connection connection = ConnectionFactory.getConnection("products_db");
        String sqlCommand = "select * from `products_db`.`product` order by `id` desc limit 3;";

        int counter = 0;
        int[] lastThreeIDs = new int[3];

        try(Statement stm = connection.createStatement()){
            ResultSet resultSet = stm.executeQuery(sqlCommand);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                lastThreeIDs[counter] = id;
                counter++;
            }
            return lastThreeIDs;
        } catch (SQLException exception){
            exception.printStackTrace();
        }
        return null;
    }


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

    public static Product select(int _id){
        Connection connection = ConnectionFactory.getConnection("products_db");
        String sqlCommand = "select `id`, `name`, `description`, `quantity`, `price` from `products_db`.`product` where `id` = '" + _id + "';";

        Product product = new Product();

        try(Statement stm = connection.createStatement()){
            ResultSet resultSet = stm.executeQuery(sqlCommand);
            while (resultSet.next()){
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setPrice(resultSet.getDouble("price"));
            }
        } catch (SQLException exception){
            exception.printStackTrace();
        }
        return product;
    }

    public static void save(Product product){
        Connection connection = ConnectionFactory.getConnection("products_db");
        String sqlCommand = "insert into `products_db`.`product` (`id`, `name`, `description`, `quantity`, `price`) values ('" + product.getId() + "', '" + product.getName() + "', '" + product.getDescription() + "', '" + product.getQuantity() + "', '" + product.getPrice()+ "');";

        try {
            Statement stm = connection.createStatement();
            if(stm != null){
                stm.executeUpdate(sqlCommand);
                connection.close();
                System.out.println("\t+ " + product.getName() + ", " + product.getDescription() + ", " + product.getQuantity() + ", " + product.getPrice());
            }
        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }

    public static void update(int _id, Product product){
        Connection connection = ConnectionFactory.getConnection("products_db");
        String sqlCommand = "update `products_db`.`product` set `name` = '" + product.getName() + "', `description` = '" + product.getDescription() + "', `quantity` = '" + product.getQuantity() + "', `price` = '" + product.getPrice()+ "' where (`id` = '" + _id + "');";

        Product updatedProduct = select(_id);

        try {
            Statement stm = connection.createStatement();
            if(stm != null){
                stm.executeUpdate(sqlCommand);
                connection.close();
                System.out.println("\nProduto atualizado com sucesso:");
                System.out.println("\t- " + updatedProduct.getName() + ", " + updatedProduct.getDescription() + ", " + updatedProduct.getQuantity() + ", " + updatedProduct.getPrice());
                System.out.println("\t+ " + product.getName() + ", " + product.getDescription() + ", " + product.getQuantity() + ", " + product.getPrice());
            }
        } catch (SQLException exception){
            exception.printStackTrace();
        }

    }

    public static void delete(int _id){
        Connection connection = ConnectionFactory.getConnection("products_db");
        String sqlCommand = "delete from `products_db`.`product` where (`id` = '" + _id + "');";

        Product product = select(_id);

        try {
            Statement stm = connection.createStatement();
            if(stm != null){
                stm.executeUpdate(sqlCommand);
                connection.close();
                System.out.println("\nProduto deletado com sucesso:");
                System.out.println("\t- " + product.getName() + ", " + product.getDescription() + ", " + product.getQuantity() + ", " + product.getPrice());
            }
            else {
                System.out.println("Não foi possivel deletar o produto... Statement retornando nulo!");
            }
        } catch (SQLException exception){
            exception.printStackTrace();
        }

    }
}
