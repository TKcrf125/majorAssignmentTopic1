package combat;

import combat.domain.CombatTeam;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for CombatTeam.
 */
public class CombatTeamTest {
    @Test
    void testTeamInitialization() {
        CombatTeam team = new CombatTeam();
        assertNotNull(team.getTroops());
        assertFalse(team.isDefeated());
    }
}
