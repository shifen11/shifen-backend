package com.coder.shifen.server;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@RestController
@RequestMapping("/health")
@Tag(name = "管理后台 - 部门")
public class HealthController {
    // #region agent log
    private static void logDebug(String hypothesisId, String location, String message, Object data) {
        try {
            String logPath = "g:\\Documents\\code\\shifen\\shifen-backend\\.cursor\\debug.log";
            String logEntry = String.format("{\"sessionId\":\"debug-session\",\"runId\":\"run1\",\"hypothesisId\":\"%s\",\"location\":\"%s\",\"message\":\"%s\",\"data\":%s,\"timestamp\":%d}%n",
                hypothesisId, location, message, data != null ? "\"" + data.toString() + "\"" : "null", System.currentTimeMillis());
            Files.write(Paths.get(logPath), logEntry.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Exception ignored) {}
    }
    // #endregion
    @GetMapping("health")
  public Integer health(@RequestParam("id") Integer id){
      // #region agent log
      logDebug("A", "HealthController.java:14", "health method entry", "id=" + id);
      // #endregion
      // #region agent log
      logDebug("A", "HealthController.java:15", "health method return", "returning id=" + id);
      // #endregion
      return id;
  }
}
