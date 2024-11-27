package ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class TestProduto {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Coca-cola", 4, 10));
        produtos.add(new Produto("Pepsi", 3, 10));
        produtos.add(new Produto("Fanta", 5.5, 10));

        List<Produto> teste = produtos
                .stream()
                .toList();
        teste.forEach(p -> System.out.println(p));

//        List<Produto> teste = produtos
//                .stream()
//                .filter(p -> p.getPreco() < 5)
//                .toList();
//         teste.forEach(p -> System.out.println(p.getPreco()));

//        List<String> teste = produtos
//                .stream()
//                .filter(p -> p.getPreco() < 5)
//                .map(p -> p.getNome().toUpperCase())
//                .distinct()
//                .toList();
//        teste.forEach(p -> System.out.println(p));
    }
}

