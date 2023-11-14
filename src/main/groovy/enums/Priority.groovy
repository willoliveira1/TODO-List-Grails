package enums

enum Priority {
    URGENT('Urgente'),
    HIGH('Alta'),
    MEDIUM('Média'),
    MINOR('Média-Baixa'),
    LOW('Baixa')

    final String name

    Priority(String name) {
        this.name = name
    }

}
