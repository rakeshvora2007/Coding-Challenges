package edu.fullerton.cs476.servlet;

import edu.fullerton.cs476.bean.CoinBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Rakesh J on 3/2/2017.
 */
@WebServlet(urlPatterns = {"/flippingServlet"})
public class FlipServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CoinBean coinBean=new CoinBean();
        coinBean.setFlip(Integer.parseInt(req.getParameter("flip")));
        coinBean.coinFlippingLogic();
        resp.sendRedirect(req.getContextPath() + "/flipping.jsp?flip="+coinBean.getFlip()+"&coin="+coinBean.getCoin());

    }
}
