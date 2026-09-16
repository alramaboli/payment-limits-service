# Architecture

## Purpose

Manages customer payment limits

## Architecture

    Consumer
       |
       v
   REST API
       |
       v
 payment-limits-service
       |
       v
 Domain Logic

## Engineering Principles

The service follows:

- High cohesion
- Loose coupling
- Information hiding
- Dependency inversion
- API-first design
