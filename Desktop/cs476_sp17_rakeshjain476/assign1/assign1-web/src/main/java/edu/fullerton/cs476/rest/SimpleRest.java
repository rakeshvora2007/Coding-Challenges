package edu.fullerton.cs476.rest;

import edu.fullerton.cs476.bean.ArithmeticBean;
import edu.fullerton.cs476.bean.CoinBean;

import javax.ws.rs.*;

/**
 * Created by Rakesh J on 3/2/2017.
 */
@Path("/simple")
public class SimpleRest {

    private int firstNumber;
    private int secondNumber;

    //curl http://localhost:8080/rest/simple/coinsget?flip=10
    @GET
    @Path("coinsget") // path: contextname/rest/simple/coinsget
    @Produces({"application/json"})
    public CoinBean getCarWithName(@QueryParam("flip") int flip) {
        CoinBean coinBean=new CoinBean();
        coinBean.setFlip(flip);
        coinBean.coinFlippingLogic();
        return coinBean;
    }

    //curl -X POST --data "flip=10" http://localhost:8080/rest/simple/coinspost
    @POST
    @Path("coinspost") // path: contextname/rest/simple/coinspost
    @Produces({"application/json"})
    public CoinBean registerForACar(@FormParam("flip") int flip) {
        CoinBean cb= new CoinBean();
        cb.setFlip(flip);
        cb.coinFlippingLogic();
        return cb;
    }

    //curl "http://localhost:8080/rest/simple/add?firstNumber=2&secondNumber=4"
    @GET
    @Path("add")
    @Produces({"application/json"})
    public ArithmeticBean addition(@QueryParam("firstNumber") int firstNumber, @QueryParam("secondNumber") int secondNumber) {
        ArithmeticBean ar = new ArithmeticBean();
        ar.addition(firstNumber, secondNumber);
        return ar;
    }

    //curl "http://localhost:8080/rest/simple/subtract?firstNumber=2&secondNumber=4"
    @GET
    @Path("subtract")
    @Produces({"application/json"})
    public ArithmeticBean subtraction(@QueryParam("firstNumber") int firstNumber, @QueryParam("secondNumber") int secondNumber) {
        ArithmeticBean ar = new ArithmeticBean();
        ar.subtraction(firstNumber, secondNumber);
        return ar;
    }

    //curl "http://localhost:8080/rest/simple/multiply?firstNumber=2&secondNumber=4"
    @GET
    @Path("multiply")
    @Produces({"application/json"})
    public ArithmeticBean multiplication(@QueryParam("firstNumber") int firstNumber, @QueryParam("secondNumber") int secondNumber) {
        ArithmeticBean ar = new ArithmeticBean();
        ar.multiplication(firstNumber, secondNumber);
        return ar;
    }

    //curl "http://localhost:8080/rest/simple/divide?firstNumber=2&secondNumber=4"
    @GET
    @Path("divide")
    @Produces({"application/json"})
    public ArithmeticBean division(@QueryParam("firstNumber") int firstNumber, @QueryParam("secondNumber") int secondNumber) {
        ArithmeticBean ar = new ArithmeticBean();
        ar.division(firstNumber, secondNumber);
        return ar;
    }


}
