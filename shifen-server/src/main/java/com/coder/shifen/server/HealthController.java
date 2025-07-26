package com.coder.shifen.server;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@Tag(name = "管理后台 - 部门")
public class HealthController {
    @GetMapping("health")
  public Integer health(@RequestParam("id") Integer id){
      return id;
  }
}
