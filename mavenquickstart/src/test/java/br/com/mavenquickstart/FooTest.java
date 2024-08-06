package br.com.mavenquickstart;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class FooTest {

    @Test
    public void testDoFoo() {
        // Cria um mock para a classe Bar
        Bar bar = mock(Bar.class);

        // Cria um BarFactory mock que retorna o mock Bar
        BarFactory myFactory = new BarFactory() {
            @Override
            public Bar createBar() {
                return bar;
            }
        };

        // Cria uma instância da classe Foo usando o factory mock
        Foo foo = new Foo(myFactory);

        // Executa o método foo()
        foo.foo();

        // Verifica se o método someMethod() foi chamado uma vez
        verify(bar, times(1)).someMethod();
    }
}
