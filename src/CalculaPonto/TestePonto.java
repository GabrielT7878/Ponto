package CalculaPonto;

public class TestePonto {
    public static void main(String[] args) {
        Ponto primeiroPonto = new Ponto();
        Ponto segundoPonto = new Ponto(400,230);
        primeiroPonto.setX(200);
        primeiroPonto.setY(200);
        Ponto outraRefSegundoPonto = segundoPonto;

        System.out.println("Coordenadas do primeiro ponto (x,y):" + "(" + primeiroPonto.getX() + ", " + primeiroPonto.getY() + ")");
        System.out.println("Coordenadas do segundo ponto (x,y):" + "(" + segundoPonto.getX() + ", " + segundoPonto.getY() + ")");
        System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto (x,y):" + "(" + outraRefSegundoPonto.getX() + ", " + outraRefSegundoPonto.getY() + ")");

        System.out.println("\nAlterando as coordenadas do segundo ponto para 840,350\n");
        outraRefSegundoPonto.setX(840);
        outraRefSegundoPonto.setY(350);

        System.out.println("Coordenadas do primeiro ponto (x,y):" + "(" + primeiroPonto.getX() + ", " + primeiroPonto.getY() + ")");
        System.out.println("Coordenadas do segundo ponto (x,y):" + "(" + segundoPonto.getX() + ", " + segundoPonto.getY() + ")");
        System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto (x,y):" + "(" + outraRefSegundoPonto.getX() + ", " + outraRefSegundoPonto.getY() + ")");



    }
}
