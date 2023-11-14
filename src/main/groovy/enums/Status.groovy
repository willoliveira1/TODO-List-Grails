package enums

enum Status {
    TODO('Fazer'),
    DOING('Fazendo'),
    DONE('Feito')

    final String name

    Status(String name) {
        this.name = name
    }

}
