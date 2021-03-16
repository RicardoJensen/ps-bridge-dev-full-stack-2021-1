package br.com.ricardoeyng.prime;

import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/prime")
public class Controller {

    @RequestMapping("/{n1}/{n2}")
    public Response calculate(@PathVariable int n1, @PathVariable int n2) {
        ArrayList<Integer> primeList = new ArrayList<>();
        int temp = n1;
        boolean flag;

        if (n1 > 99999 || n1 < 0) {
            return new Response();
        }

        if (n2 > 99999 || n2 < 0)
            return  new Response();

        if (n1 > n2) {
            n1 = n2;
            n2 = temp;
        }

        while (n1 < n2) {
            flag = false;

            if (n1 <= 1) {
                ++n1;
                continue;
            }

            for (int i = 2; i <= n1 / 2; ++i) {
                if (n1 % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                primeList.add(n1);
            }

            ++n1;
        }

        return new Response(n1, n2, primeList);
    }

}
