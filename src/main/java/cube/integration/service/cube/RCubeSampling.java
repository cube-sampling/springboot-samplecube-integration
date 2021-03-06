package cube.integration.service.cube;

import cube.integration.model.Unit;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.List;
import java.util.function.DoubleSupplier;

@Service
@ConditionalOnProperty(value="cube-sampling",
        havingValue = "r", matchIfMissing = true)
public class RCubeSampling implements CubeSamplingService{
    @Override
    public List<Unit> sampleCube(Collection<Long> samplingUnitsIds, Collection<Double> inclusionProbabilities, DoubleSupplier randomFunction, int dataOrder, boolean landingPhaseProgrammingMethod) {
        return null;
    }
}
