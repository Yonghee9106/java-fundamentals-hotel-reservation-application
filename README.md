# Hotel Reservation Application

## Project Description

## Features

## Scenarios

## Architecture
* **Layers** are implemented to support modularization and decoupling. Each layer is capable of communication only with adjacent layers.
* **CLI (Command Line Interface) for UI (User Interface)**, all inputs and outputs, including room info and customer details, are routed through the CLI.
* **Resources** will function as Application Programming Interface (API) connecting with our UI.
* **Services** will interact with resources, establishing the essential business logic needed to deliver feedback to our User Interface (UI).
* **Data models** will be employed to depict the domain utilized within the system, encompassing entities such as rooms, reservations, and customers.
