import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet", urlPatterns = "/discount")
public class ProductDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description=request.getParameter("description");
        double price = Float.parseFloat(request.getParameter("price"));
        double discount = Float.parseFloat(request.getParameter("discount"));
        double discountAmountPrice=(price *0.01) *discount  ;
        double result= price-discountAmountPrice;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: " + description+ "</h1>");
        writer.println("<h1>Price: " + price+ "</h1>");
        writer.println("<h1>Discount Percent: " + discount+ "%</h1>");
        writer.println("<h1>discountAmountPrice: $"+discountAmountPrice+"</h1>");
        writer.println("<h1>Discount Price: $"+result+"</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
