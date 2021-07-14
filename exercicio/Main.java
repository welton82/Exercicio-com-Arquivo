package exercicio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        Produto produto = new Produto();
        Scanner scan = new Scanner(System.in);
        produtos(scan);
       /* System.out.print("Deseja continuar? [s/n]: ");
        char c = scan.nextLine().charAt(0);
*/

    }

    public static void produtos(Scanner scan){


        boolean bContinue = true;
        Produto produto = new Produto();
        List <Produto> p = new ArrayList<>();
        while(bContinue){
            int op = menu(scan);
            switch (op){
                case 1:

                    System.out.println("INSERINDO PRODUTO");
                    System.out.print("Nome: ");
                    scan.nextLine();
                    produto.setNome(scan.nextLine());
                    System.out.print("Valor: ");
                    produto.setValor(scan.nextDouble());
                    System.out.print("Qde: ");
                    produto.setQde(scan.nextInt());
                    produto.adiciona(produto);
                    break;
                case 2:
                    //produto.getLista();
                    System.out.println("======= LISTANDO ====================");
                    System.out.println(produto.toString());
                    break;
                case 3:
                    System.out.print("Informe Onde salvar + nome Arquivo: ");
                    scan.nextLine();
                    String path = scan.nextLine();
                    String[]lines = {produto.toString()};


                    try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){

                        for(String l: lines){
                            bw.write(l);
                            bw.newLine();
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    BufferedReader bf = null;
                    FileReader fr = null;
                    try{

                        String file = path;
                        fr = new FileReader(file);
                        bf = new BufferedReader(fr);

                        String line = bf.readLine();

                        while(line != null){
                            System.out.println(line);
                            line=bf.readLine();

                        }


                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 4:
                    scan.nextLine();
                    bf = null;
                    fr = null;
                    try{
                        System.out.print("Caminho e pasta para Busca: ");
                        String file = scan.nextLine();
                        fr = new FileReader(file);
                        bf = new BufferedReader(fr);

                        String line = bf.readLine();

                        while(line != null){
                            System.out.println(line);
                            line=bf.readLine();

                        }


                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;

                default :
                System.out.println("Error");
                break;
            }

            scan.nextLine();
            try{
                System.out.print("Deseja continuar? [s/n]: ");
                char c = scan.nextLine().charAt(0);

                if(c != 's' && c != 'S'){
                    bContinue = !bContinue;
                }
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

/*
            */
        }

    }

    public static int menu(Scanner scan){
        System.out.println("Informe as Opções Válidas");
        System.out.println("1 - Inserir Produtos");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Criar arquivo");
        System.out.println("4 - Buscar Pasta");
        System.out.print("Operação: ");
        int op = scan.nextInt();
        return op;
    }

}
