package JavaCore.KEnumeração.Dominio;

public enum TipoPagamento {
      DEBITO{
          @Override
          public double CalcularDesconto(double valor) {
              return valor * 0.1;
          }
      },CREDITO{
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

      public abstract double CalcularDesconto(double valor);

    }