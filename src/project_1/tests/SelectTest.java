package project_1.tests;

import project_1.daos.ProductDAO;

public class SelectTest {
    public static void main(String[] args) {
        int[] last3 = ProductDAO.selectLastThreeIDs();

        for (int i = 0; i < last3.length; i++) {
            System.out.println(last3[i]);
        }

        ProductDAO.select(last3[0]);
        ProductDAO.select(last3[1]);
        ProductDAO.select(last3[2]);

    }
}
