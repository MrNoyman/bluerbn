package com.noyman.amit.baggage;

import com.noyman.amit.data.DataCenter;
import com.noyman.amit.model.Baggage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BaggageService {

    private final static Logger log = LogManager.getLogger(BaggageService.class);

    @Autowired
    private DataCenter dataCenter;

    public boolean checkin(int destId, int baggageId) {
        log.trace("Entry to checkin with params: dest id - {}, baggage id  {}", destId, baggageId);
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
        log.traceExit("Answer to checkin is {}", answer);
        return answer;
    }
}
