public class Tenis extends Produto{
        String marca;
        String modelo;
        double tamanho;

        public Tenis(String descricao, String armazem, int ano,String marca,String modelo,double tamanho) {
            super(descricao, ano, armazem);
            this.marca = marca;
            this.modelo = modelo;
            this.tamanho = tamanho;
        }

        @Override
        public void exibirInfo(){
            System.out.println("Sua descrição é: "+ descricao+" o armazem que está guardado é o: " + armazem+", versão do ano: "+ ano);
            System.out.println("De modelo: "+modelo+" da marca: "+marca+" com tamanho : "+tamanho);
        }
    }
