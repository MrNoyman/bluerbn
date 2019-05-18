package com.noyman.amit.tickets;

import com.noyman.amit.data.DataCenter;
import com.noyman.amit.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.Optional;

@Service
public class TicketService {


    @Autowired
    private DataCenter dataCenter;

    public boolean isValidTicket(Integer ticketId) {
        boolean answer = false;
        if (ticketId == null) {
            throw new IllegalStateException("Ticket id is NULL");
        }
        Optional<Ticket> optional = dataCenter.getTickets().stream().filter(t -> t.getId() == ticketId).findFirst();
        if (optional.isPresent()) {
            Ticket ticket = optional.get();
            if (dataCenter.isValidUser(ticket.getPassengerId()) &&
                    dataCenter.isValidDestination(ticket.getDestinationId()) &&
                            ticket.getBoardingTime().isAfter(ZonedDateTime.now())) {
                answer = true;
            }
        }
        return answer;
    }
}
