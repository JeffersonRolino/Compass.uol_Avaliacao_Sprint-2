package project_1.tests;

import project_1.classes.Catalog;
import project_1.classes.Product;
import project_1.daos.ProductDAO;

public class saveTest {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Product monitorOzone = new Product("Monitor Ozone 27", "Monitor Gamer Ozone 27 Led, 144 Hz, Quad HD, 1ms, FreeSync", 3, 1999.90);
        Product processadorAMD = new Product("Processador AMD Ryzen 5", "Processador AMD Ryzen 5 5600X, Cache 35MB, 3.7GHz (4.6GHz Max Turbo), AM4, Sem Video", 25, 1359.90);
        Product headsetGamerHyperX = new Product("Headset Gamer HyperX", "Headset Gamer HyperX Cloud Stinger, Drivers 50mm, Multiplas Plataformas, P2 e P3 - HX-HSCS-BK/NA", 13, 249.90);
        Product ssdKingstonA400 = new Product("SSD Kingston A400", "SSD Kingston A400, 240GB, SATA, Leitura 500MB/s, Gravação 350MB/s - SA400S37/240G", 53, 189.90);
        Product xBox = new Product("Console Microsoft Xbox", "Console Microsoft Xbox Series S, 512GB, Branco - RRS-00006", 5, 2149.00);
        Product controleNoxKrom = new Product("Controle NOX Krom", "Controle NOX Krom Gaming KEY, PC, PS3, Android, Preto Fosco/Laranja - NXKROMKEY", 35, 99.90);
        Product ssdKingston = new Product("Controle NOX Krom", "Controle NOX Krom Gaming KEY, PC, PS3, Android, Preto Fosco/Laranja - NXKROMKEY", 35, 99.90);
        Product vgaAsusTUF = new Product("Placa de Video Asus TUF RTX 3090 TI", "Placa de Vídeo Asus TUF RTX 3090 TI O 24G GAMING - 90YV0HC1-M0NA00", 3, 16999.90);
        Product vgaGigabyte = new Product("Gigabyte NVIDIA GeForce GTX 1660 Ti", "Placa de Vídeo Gigabyte NVIDIA GeForce GTX 1660 Ti OC 6G, GDDR6 - GV-N166TOC-6GD", 12, 2499.90);

        catalog.addProduct(monitorOzone);
        catalog.addProduct(processadorAMD);
        catalog.addProduct(headsetGamerHyperX);
        catalog.addProduct(ssdKingstonA400);
        catalog.addProduct(xBox);
        catalog.addProduct(controleNoxKrom);
        catalog.addProduct(ssdKingston);
        catalog.addProduct(vgaAsusTUF);
        catalog.addProduct(vgaGigabyte);

        catalog.getProducts().forEach(ProductDAO::save);

//        ProductDAO.save(monitor);
//        ProductDAO.save(monitor2);

//        monitor2.setName("Monitor Atualizado");
//        ProductDAO.update(monitor2);

    }
}
