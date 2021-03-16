package br.com.ricardoeyng.prime;

import java.util.ArrayList;

public class Response {
    private int n1;
    private int n2;

    private ArrayList<Integer> result;

    public  Response() {

    }

    public Response(int n1, int n2, ArrayList<Integer> result) {
        this.n1 = n1;
        this.n2 = n2;
        this.result = result;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public ArrayList<Integer> getResult() {
        return result;
    }

    public void setResult(ArrayList<Integer> result) {
        this.result = result;
    }

}
