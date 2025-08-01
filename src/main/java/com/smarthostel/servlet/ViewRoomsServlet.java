package com.smarthostel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smarthostel.dao.RoomDAO;
import com.smarthostel.entity.Room;

@WebServlet("/viewRooms")
public class ViewRoomsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoomDAO dao = new RoomDAO();
        List<Room> list = dao.getAllRooms();
        request.setAttribute("rooms", list);
        request.getRequestDispatcher("viewRoom.jsp").forward(request, response);
    }
}

