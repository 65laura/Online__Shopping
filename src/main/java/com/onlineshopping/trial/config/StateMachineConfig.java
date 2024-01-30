package com.onlineshopping.trial.config;
import com.onlineshopping.trial.enums.OrderEvents;
import com.onlineshopping.trial.enums.OrderStates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.StateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.listener.StateMachineListener;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.transition.Transition;
import java.util.EnumSet;
@Configuration
@EnableStateMachine
public class StateMachineConfig extends StateMachineConfigurerAdapter<OrderStates, OrderEvents> {
    @Override
    public void configure(StateMachineConfigurationConfigurer<OrderStates, OrderEvents> config)
            throws Exception {
        config.withConfiguration()
                .autoStartup(true)
                .listener(listener());
    }

    @Override
    public void configure(StateMachineStateConfigurer<OrderStates, OrderEvents> states)
            throws  Exception{
        states
                .withStates()
                .initial(OrderStates.SUBMITTED)
                .states(EnumSet.allOf(OrderStates.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<OrderStates,OrderEvents> transitions)
            throws Exception{
        transitions
                .withExternal()
                .source(OrderStates.SUBMITTED).target(OrderStates.SUBMITTED).event(OrderEvents.FULFILL)
                .and()
                .withExternal()
                .source(OrderStates.SUBMITTED).target(OrderStates.PAID).event(OrderEvents.PAID)
                .and()
                .withExternal()
                .source(OrderStates.SUBMITTED).target(OrderStates.CANCELLED).event(OrderEvents.CANCELLED);
    }

    @Bean
    public StateMachineListener<OrderStates, OrderEvents> listener(){
        return new StateMachineListener<OrderStates, OrderEvents>() {

            @Override
            public void stateChanged(State<OrderStates, OrderEvents> state, State<OrderStates, OrderEvents> to) {
                System.out.println("State change to" + to.getId());

            }

            @Override
            public void stateEntered(State<OrderStates, OrderEvents> state) {

            }

            @Override
            public void stateExited(State<OrderStates, OrderEvents> state) {

            }

            @Override
            public void eventNotAccepted(Message<OrderEvents> message) {

            }

            @Override
            public void transition(Transition<OrderStates, OrderEvents> transition) {

            }

            @Override
            public void transitionStarted(Transition<OrderStates, OrderEvents> transition) {

            }

            @Override
            public void transitionEnded(Transition<OrderStates, OrderEvents> transition) {

            }

            @Override
            public void stateMachineStarted(StateMachine<OrderStates, OrderEvents> stateMachine) {

            }

            @Override
            public void stateMachineStopped(StateMachine<OrderStates, OrderEvents> stateMachine) {

            }

            @Override
            public void stateMachineError(StateMachine<OrderStates, OrderEvents> stateMachine, Exception e) {

            }

            @Override
            public void extendedStateChanged(Object o, Object o1) {

            }

            @Override
            public void stateContext(StateContext<OrderStates, OrderEvents> stateContext) {

            }
        };
    }



}

