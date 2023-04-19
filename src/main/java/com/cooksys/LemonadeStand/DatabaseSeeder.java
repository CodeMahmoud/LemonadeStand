    package com.cooksys.LemonadeStand;

    import com.cooksys.LemonadeStand.entities.Customer;
    import com.cooksys.LemonadeStand.entities.Lemonade;
    import com.cooksys.LemonadeStand.repositories.CustomerRepository;
    import com.cooksys.LemonadeStand.repositories.LemonadeRepository;
    import com.cooksys.LemonadeStand.repositories.LemonadeStandRepository;
    import com.cooksys.LemonadeStand.repositories.OrderRepository;
    import lombok.AllArgsConstructor;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.stereotype.Component;

    @Component
    @AllArgsConstructor
    public class DatabaseSeeder implements CommandLineRunner {

        private LemonadeRepository lemonadeRepository;
        private LemonadeStandRepository lemonadeStandRepository;
        private OrderRepository orderRepository;
        private CustomerRepository customerRepository;

        @Override
        public void run(String... args) throws Exception {

            Lemonade lemonade = new Lemonade();
            lemonade.setLemonJuice(3.25);
            lemonade.setWater(2.5);
            lemonade.setSugar(1.25);
            lemonade.setIceCubes(5);
            lemonade.setPrice(4.50);

            lemonadeRepository.saveAndFlush(lemonade);
            System.out.println(lemonadeRepository.findAll());
            System.out.println(lemonadeStandRepository.findAll());
            System.out.println(orderRepository.findAll());
            System.out.println(customerRepository.findAll());

        }
    }
