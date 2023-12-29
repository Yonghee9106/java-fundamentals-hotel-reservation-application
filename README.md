# Hotel Reservation Application

## Project Description

## Features

## Scenarios

## Architecture
![Capture](https://github.com/Yonghee9106/java-fundamentals-hotel-reservation-application/assets/79752787/88c8b60e-792c-4fd1-9661-3f9a9d84a302)
* **Layers** to support modularization and decoupling. Each layer is capable of communication only with adjacent layers.
* **CLI (Command Line Interface) for UI (User Interface)**, all inputs and outputs, including room info and customer details, are routed through the CLI.
* **Resources** will function as Application Programming Interface (API) connecting with our UI.
* **Services** will interact with resources, establishing the essential business logic needed to deliver feedback to our User Interface (UI).
* **Data models** will be used to represent the domain utilized within the system (e.g., rooms, reservations, and customers).
