import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        System.out.println("--- MENU PRINCIPAL ---" +
                "\n1- Cadastrar animal;" +
                "\n2- Listar animal;" +
                "\n3- Remover animal;" +
                "\n4- Editar animal;" +
                "\n5- Doar animais" +
                "\n6- Sair.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                cadastrar();
                break;
            case 2:
                listar();
                break;
            case 3:
                remover();
                break;
            case 4:
                editar();
                break;
            case 5:
                doar();
                break;
            case 6:
                System.out.println("Obrigado por utilizar nosso programa. Volte sempre!");
                System.exit(0);
                break;
        }
    }

    private static void doar() {
        System.out.println("--- DOAR ---" +
                "\n1- Cachorro;" +
                "\n2- Gato;" +
                "\n3- Voltar.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                doarCachorro();
                break;
            case 2:
                doarGato();
                break;
            case 3:
                menuPrincipal();
                break;
        }
    }

    private static void doarGato() {
        System.out.println("--- DOAR GATO ---");
        System.out.println("Nome do gato: ");
        String nome = sc.next();
        for (int i = 0; i < Gato.listaGato.size(); i++){
            if (nome.equals(Gato.listaGato.get(i).getNome())){
                System.out.println("Têm certeza que deseja doar o(a) " + nome + "?" +
                        "\n1- Sim;" +
                        "\n2- Não.");
                int opcaoDoar = sc.nextInt();
                switch (opcaoDoar){
                    case 1:
                        Gato gato = Gato.listaGato.get(i);
                        Animal.listaDoados.add(gato);
                        Gato.listaGato.remove(i);
                        System.out.println("Gatinho doado com sucesso!");
                        break;
                    case 2:
                        menuPrincipal();
                        break;
                }
            }
        }
        menuPrincipal();
    }

    private static void doarCachorro() {
        System.out.println("--- DOAR CACHORRO ---");
        System.out.println("Nome do cachorro: ");
        String nome = sc.next();
        for (int i = 0; i < Cachorro.listaCachorro.size(); i++){
            if (nome.equals(Cachorro.listaCachorro.get(i).getNome())){
                System.out.println("Têm certeza que deseja doar o(a) " + nome + "?" +
                        "\n1- Sim;" +
                        "\n2- Não.");
                int opcaoDoar = sc.nextInt();
                switch (opcaoDoar){
                    case 1:
                        Cachorro cachorro = Cachorro.listaCachorro.get(i);
                        Animal.listaDoados.add(cachorro);
                        Cachorro.listaCachorro.remove(i);
                        System.out.println("Cachorrinho doado com sucesso!");
                        break;
                    case 2:
                        menuPrincipal();
                        break;
                }
            }
        }
        menuPrincipal();
    }

    private static void editar() {
        System.out.println("--- EDITAR ANIMAL ---" +
                "\n1- Cachorro;" +
                "\n2- Gato;" +
                "\n3- Voltar.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                editarCachorro();
                break;
            case 2:
                editarGato();
                break;
            case 3:
                menuPrincipal();
                break;
        }
    }

    private static void editarGato() {
        System.out.println("Nome: ");
        String nome = sc.next();
        for (int i = 0; i < Gato.listaGato.size(); i++){
            if (nome.equals(Gato.listaGato.get(i).getNome())){
                System.out.println("Quantos atributos deseja editar?" +
                        "\n1- Somente um atributo;" +
                        "\n2- Todos os atributos.");
                int opcao = sc.nextInt();
                switch (opcao){
                    case 1:
                        System.out.println("Qual atributo desejas editar?" +
                                "\n1- Nome;" +
                                "\n2- Raça;" +
                                "\n3- Altura;" +
                                "\n4- Peso;" +
                                "\n5- Miar;" +
                                "\n6- Quantidade de leite que bebe;" +
                                "\n7- Tamanho unha.");
                        opcao = sc.nextInt();
                        switch (opcao){
                            case 1:
                                System.out.println("Nome: ");
                                Gato.listaGato.get(i).setNome(sc.next());
                                break;
                            case 2:
                                System.out.println("Raça: ");
                                Gato.listaGato.get(i).setRaca(sc.next());
                                break;
                            case 3:
                                System.out.println("Altura: ");
                                Gato.listaGato.get(i).setAltura(sc.nextDouble());
                                break;
                            case 4:
                                System.out.println("Peso: ");
                                Gato.listaGato.get(i).setPeso(sc.nextDouble());
                                break;
                            case 5:
                                System.out.println("Miar: ");
                                Gato.listaGato.get(i).setMiar(sc.next());
                                break;
                            case 6:
                                System.out.println("Altura: ");
                                Gato.listaGato.get(i).setQtdLeite(sc.next());
                                break;
                            case 7:
                                System.out.println("Altura: ");
                                Gato.listaGato.get(i).setTamanhoUnha(sc.next());
                                break;
                        }
                        break;
                    case 2:
                        Gato gato = cadastroGato();
                        Gato.listaGato.set(i, gato);
                        break;
                }
            } else {
                System.out.println("Nenhum gato encontrado com esse nome!");
            }
        }
        menuPrincipal();
    }

    private static void editarCachorro() {
        System.out.println("Nome: ");
        String nome = sc.next();
        for (int i = 0; i < Cachorro.listaCachorro.size(); i++){
            if (nome.equals(Cachorro.listaCachorro.get(i).getNome())){
                System.out.println("Quantos atributos deseja editar?" +
                        "\n1- Somente um atributo;" +
                        "\n2- Todos os atributos.");
                int opcao = sc.nextInt();
                switch (opcao){
                    case 1:
                        System.out.println("Qual atributo desejas editar?" +
                                "\n1- Nome;" +
                                "\n2- Raça;" +
                                "\n3- Altura;" +
                                "\n4- Peso;" +
                                "\n5- Latir;" +
                                "\n6- Brincar com bolinha;" +
                                "\n7- Farejar.");
                        opcao = sc.nextInt();
                        switch (opcao){
                            case 1:
                                System.out.println("Nome: ");
                                Cachorro.listaCachorro.get(i).setNome(sc.next());
                                break;
                            case 2:
                                System.out.println("Raça: ");
                                Cachorro.listaCachorro.get(i).setRaca(sc.next());
                                break;
                            case 3:
                                System.out.println("Altura: ");
                                Cachorro.listaCachorro.get(i).setAltura(sc.nextDouble());
                                break;
                            case 4:
                                System.out.println("Peso: ");
                                Cachorro.listaCachorro.get(i).setPeso(sc.nextDouble());
                                break;
                            case 5:
                                System.out.println("Latir: ");
                                Cachorro.listaCachorro.get(i).setLatir(sc.next());
                                break;
                            case 6:
                                System.out.println("Altura: ");
                                Cachorro.listaCachorro.get(i).setBrincarBolinha(sc.next());
                                break;
                            case 7:
                                System.out.println("Altura: ");
                                Cachorro.listaCachorro.get(i).setFarejar(sc.next());
                                break;
                        }
                        break;
                    case 2:
                        Cachorro cachorro = cadastroCachorro();
                        Cachorro.listaCachorro.set(i, cachorro);
                        break;
                }
            } else {
                System.out.println("Nenhum cachorro encontrado com esse nome!");
            }
        }
        menuPrincipal();
    }

    private static void remover() {
        System.out.println("--- REMOVER ---" +
                "\n1- Cachorro;" +
                "\n2- Gato;" +
                "\n3- Voltar.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                removerCachorro();
                break;
            case 2:
                removerGato();
                break;
            case 3:
                menuPrincipal();
                break;
        }
    }

    private static void removerGato() {
        System.out.println("--- REMOVER GATO ---");
        System.out.println("Nome: ");
        String nome = sc.next();
        for (int i = 0; i < Gato.listaGato.size(); i++){
            if (nome.equals(Gato.listaGato.get(i).getNome())){
                Gato.listaGato.remove(i);
            }
        }
        menuPrincipal();
    }

    private static void removerCachorro() {
        System.out.println("--- REMOVER CACHORRO ---");
        System.out.println("Nome: ");
        String nome = sc.next();
        for (int i = 0; i < Cachorro.listaCachorro.size(); i++){
            if (nome.equals(Cachorro.listaCachorro.get(i).getNome())){
                Cachorro.listaCachorro.remove(i);
                System.out.println("Animal removido com sucesso!");
            }
        }
        menuPrincipal();
    }

    private static void listar() {
        System.out.println("--- LISTAR ---" +
                "\n1- Cachorro;" +
                "\n2- Gato;" +
                "\n3- Doados;" +
                "\n4- Voltar.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                listarCachorro();
                break;
            case 2:
                listarGato();
                break;
            case 3:
                listarDoados();
                break;
            case 4:
                menuPrincipal();
                break;
        }
    }

    private static void listarDoados() {
        System.out.println("ANIMAIS DOADOS: ");
        for (int i = 0; i < Animal.listaDoados.size(); i++){
            System.out.println(Animal.listaDoados.get(i).toString());
        }
        menuPrincipal();
    }

    private static void listarGato() {
        System.out.println("--- LISTAR GATO ---");
        System.out.println("Nome: ");
        String nome = sc.next();
        for (int i = 0; i < Gato.listaGato.size(); i++){
            if (nome.equals(Gato.listaGato.get(i).getNome())){
                System.out.println(Gato.listaGato.get(i).toString());
            }
        }
        menuPrincipal();
    }

    private static void listarCachorro() {
        System.out.println("--- LISTAR CACHORRO ---");
        System.out.println("Nome: ");
        String nome = sc.next();
        for (int i = 0; i < Cachorro.listaCachorro.size(); i++){
            if (nome.equals(Cachorro.listaCachorro.get(i).getNome())){
                System.out.println(Cachorro.listaCachorro.get(i).toString());
            }
        }
        menuPrincipal();
    }

    private static void cadastrar() {
        System.out.println("--- CADASTRAR ---" +
                "\n1- Cachorro;" +
                "\n2- Gato;" +
                "\n3- Voltar.");
        int opcao = sc.nextInt();
        switch (opcao){
            case 1:
                Cachorro.listaCachorro.add(cadastroCachorro());
                menuPrincipal();
                break;
            case 2:
                Gato.listaGato.add(cadastroGato());
                menuPrincipal();
                break;
            case 3:
                menuPrincipal();
                break;
        }
    }

    private static Gato cadastroGato() {
        System.out.println("--- CADASTRAR GATO ---");
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Raça: ");
        String raca = sc.next();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        System.out.println("Miar: ");
        String miar = sc.next();
        System.out.println("Quantidade de leite que bebe: ");
        String qtdLeite = sc.next();
        System.out.println("Tamanho da unha: ");
        String tamanhoUnha = sc.next();
        Gato gato = new Gato(nome, raca, altura, peso, miar, qtdLeite, tamanhoUnha);
        System.out.println("Sucesso!");
        return gato;
    }

    private static Cachorro cadastroCachorro() {
        System.out.println("--- CADASTRAR CACHORRO ---");
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Raça: ");
        String raca = sc.next();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        System.out.println("Latir: ");
        String latir = sc.next();
        System.out.println("Brincar com bolinha: ");
        String brincarBolinha = sc.next();
        System.out.println("Farejar: ");
        String farejar = sc.next();
        Cachorro cachorro = new Cachorro(nome, raca, altura, peso, latir, brincarBolinha, farejar);
        System.out.println("Sucesso!");
        return cachorro;
    }
}