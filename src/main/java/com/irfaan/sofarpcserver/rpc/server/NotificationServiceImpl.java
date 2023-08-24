package com.irfaan.sofarpcserver.rpc.server;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.irfaan.sofarpcserver.rpc.server.result.NotificationResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@SofaService(interfaceType = NotificationService.class, bindings = { @SofaServiceBinding(bindingType = "bolt") })
@Service
@Slf4j
public class NotificationServiceImpl implements NotificationService {

    @Override
    public NotificationResult result(String word) {
        NotificationResult notificationResult = new NotificationResult();
        notificationResult.setSuccess(true);
        notificationResult.setWord("Halo " + word);
        log.info("call the result service");
        return notificationResult;
    }
}
