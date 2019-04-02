/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hader.alves
 */
public class teste {
    
    public static void main(String[] args){
        
    //colaborador    
    colaborador col= new colaborador();
    col.nome="hader";
    col.idade=33;
    col.sexo="m";
          
    colaborador col2= new colaborador();
    col2.nome="theo";
    col2.idade=20;
    col2.sexo="m";
    
    colaborador col3=new colaborador();
    col3.nome="lidiane";
    col3.idade=35;
    col3.sexo="f";
    
    System.out.println("Nome col: "+col.nome);
    System.out.println("Idade col: "+col.idade);
    System.out.println("Sexo de col: "+col.sexo);
    System.out.println("\n");
    
    System.out.println("Nome col2: "+col2.nome);
    System.out.println("Idade col2: "+col2.idade);
    System.out.println("Sexo de col2: "+col2.sexo);
    System.out.println("\n");
    
    System.out.println("Nome col3: "+col3.nome);
    System.out.println("Idade col3: "+col3.idade);
    System.out.println("Sexo col3: "+col3.sexo);
    System.out.println("\n");
    
    //endereco
    
    endereco end1=new endereco();
    end1.rua="Rua A";
    end1.numero=85;
    end1.bairro="BH";
    end1.cep=39280000;
    end1.cidade="Buritizeiro";
    
    endereco end2=new endereco();
    end2.rua="B";
    end2.numero=95;
    end2.bairro="centro";
    end2.cep=39270000;
    end2.cidade="Pirapora";
    
    endereco end3=new endereco();
    end3.rua="C";
    end3.numero=105;
    end3.bairro="Santos Dumont";
    end3.cep=39270000;
    end3.cidade="Pirapora";
    
    System.out.println("Rua end1: "+end1.rua);
    System.out.println("Numero end1: "+end1.numero);
    System.out.println("Bairro endl: "+end1.bairro);
    System.out.println("Cep end1: "+end1.cep);
    System.out.println("Cidade end1: "+end1.cidade);
    System.out.println("\n");
    
    System.out.println("Rua end2: "+end2.rua);
    System.out.println("Numero end2: "+end2.numero);
    System.out.println("Bairro end2: "+end2.bairro);
    System.out.println("Cep end2: "+end2.cep);
    System.out.println("Cidade endl: "+end2.cidade);
    System.out.println("\n");
    
    System.out.println("Rua end3: "+end3.rua);
    System.out.println("Numero end3: "+end3.numero);
    System.out.println("Bairro end3: "+end3.bairro);
    System.out.println("Cep end3: "+end3.cep);
    System.out.println("Cidade end3: "+end3.cidade);
    System.out.println("\n");
    
    //produtos
    
    produtos prod1=new produtos();
    prod1.descricao="cabo usb";
    prod1.quantidade=10;
    prod1.valor=25.5;
    
    produtos prod2=new produtos();
    prod2.descricao="mouse";
    prod2.quantidade=20;
    prod2.valor=35.90;
    
    produtos prod3=new produtos();
    prod3.descricao="monitor";
    prod3.quantidade=5;
    prod3.valor=499.9;
    
    System.out.println("Descrição: "+prod1.descricao);
    System.out.println("Quantidade: "+prod1.quantidade);
    System.out.println("Valor: "+prod1.valor);
    System.out.println("\n");
    
    System.out.println("Descrição: "+prod2.descricao);
    System.out.println("Quantidade: "+prod2.quantidade);
    System.out.println("Valor: "+prod2.valor);
    System.out.println("\n");
    
    System.out.println("Descrição: "+prod3.descricao);
    System.out.println("Quantidade: "+prod3.quantidade);
    System.out.println("Valor: "+prod3.valor);
    System.out.println("\n");
        
    
    
    }
}
