package cube.integration.service.cube;

import cube.integration.model.Unit;

import java.util.Collection;
import java.util.List;
import java.util.function.DoubleSupplier;

public interface CubeSamplingService {
    /**
     * Performs cube balanced sampling on
     * @param samplingUnitsIds
     * with the vector of inclusionProbabilities:
     * @param inclusionProbabilities
     * with the vector of randomFunction:
     * @param randomFunction
     * @param dataOrder
     * @param landingPhaseProgrammingMethod
     * @return
     */
    List<Unit> sampleCube(Collection<Long> samplingUnitsIds, Collection<Double> inclusionProbabilities, DoubleSupplier randomFunction, int dataOrder, boolean landingPhaseProgrammingMethod);
}
