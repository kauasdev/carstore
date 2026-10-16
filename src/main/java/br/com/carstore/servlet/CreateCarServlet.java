package br.com.carstore.servlet;

import br.com.carstore.dao.CarDAO;
import br.com.carstore.model.Car;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String carId = req.getParameter("id");
        String carName = req.getParameter("car-name");

        Car car = new Car();
        car.setName(carName);

        if (carId == null || carId.isBlank()) {

            CarDAO.createCar(car);

        } else {

            car.setId(carId);
            CarDAO.updateCar(car);
        }

        resp.sendRedirect(req.getContextPath() + "/find-all-cars");

    }

}