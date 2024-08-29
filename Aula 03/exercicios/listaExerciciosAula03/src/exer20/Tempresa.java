public class Tempresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Loja Kingxs", "12.345.678/0001-90", 50);
        System.out.println(empresa);

        empresa.contratar();
        empresa.demitir();
        empresa.demitir();
    }
}

