import fr.simplon.lordofsimplon.api.heroes.IHeroe;
import fr.simplon.lordofsimplon.api.player.Player;
import fr.simplon.lordofsimplon.impl.heroes.Heroe;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestPlayer {
     private Player Panda;
     private IHeroe heroePanda;
     @BeforeEach
     public void initializationNewPlayer() {
         heroePanda = new Heroe ("Paladin", null);
         Panda = new Player(heroePanda, "SuperPanda", 100);
     }
    @Test
    public void testGetHeroe() {

         assertEquals(heroePanda, Panda.getHeroe());
    }
    @AfterEach
     public void deletePlayer() {
         Panda = null;
         heroePanda = null;
    }
}
