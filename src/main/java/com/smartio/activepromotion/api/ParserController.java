package com.smartio.activepromotion.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ParserController {

    @PostMapping("/fetch-ads")
    public ResponseEntity<String> fetchAds() {
        // TODO: trigger parser function
        return new ResponseEntity<>("Adds fetched", HttpStatus.CREATED);
    }
}
