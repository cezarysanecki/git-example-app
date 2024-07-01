package pl.cezarysanecki.gitapp.shared;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Collection;

public interface EventPublisher {

    void publish(DomainEvent domainEvent);

    default void publish(Collection<DomainEvent> domainEvents) {
        domainEvents.forEach(this::publish);
    }

    @Component
    @RequiredArgsConstructor
    class JustForwardingEventPublisher implements EventPublisher {

        private final ApplicationEventPublisher eventPublisher;

        @Override
        public void publish(DomainEvent domainEvent) {
            eventPublisher.publishEvent(domainEvent);
        }

    }

}
