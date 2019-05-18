package com.noyman.amit.baggage;

import com.noyman.amit.data.DataCenter;
import com.noyman.amit.model.Baggage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BaggageService {

    @Autowired
    private DataCenter dataCenter;

    public boolean checkin(int destId, int baggageId) {
        Optional<Baggage> bagOpt = dataCenter.getBaggages().stream().filter(b -> b.getBaggageId() == baggageId).findFirst();
        int passengerId;
        boolean answer = false;
        if (bagOpt.isPresent()) {
            passengerId = bagOpt.get().getPassengerId();
            if (dataCenter.isValidUser(passengerId) &&
                    dataCenter.isValidDestination(destId)) {
                answer = true;
            }
        }

        return answer;
    }
}
