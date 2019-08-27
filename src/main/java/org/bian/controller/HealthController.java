/**
 * @author Virtusa
 */
package org.bian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health/live")
    public String live() {
        return "ok";
    }

    @GetMapping("/health/ready")
    public String ready() {
        return "ok";
    }
}
