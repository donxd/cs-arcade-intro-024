int[][] minesweeper(boolean[][] matrix) {
    int[][] valoresCampo = new int[ matrix.length ][ matrix[ 0 ].length ];

    for ( int i = 0; i < matrix.length; i++ ){
        for ( int j = 0; j < matrix[ i ].length; j++ ){
            valoresCampo[ i ][ j ] = calculaValorCelda( matrix, i, j );
        }
    }

    return valoresCampo;
}

int calculaValorCelda ( boolean [][] matrix, int renglon, int columna ){
    int valor = 0;

    for ( int i = -1; i < 2; i++ ){
        for ( int j = -1; j < 2; j++ ){

            if ( !( ( i == 0 ) && ( j == 0 ) ) &&
                    ( (renglon + i) > -1 ) && ( (renglon + i) < matrix.length ) && 
                        ( (columna + j) > -1 ) && ( (columna + j) < matrix[ renglon+i ].length ) ){

                if ( matrix[ renglon+i ][ columna+j ] ){
                    valor++;
                }

            }

        }
    }

    return valor;
}