package cube.integration.web;

import cube.integration.model.Unit;
import cube.integration.service.cube.CubeSamplingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.function.DoubleSupplier;

@RestController
public class CubeSamplingController {

    private CubeSamplingService cubeSamplingService;

    @Autowired
    @Scope("request")
    public void setCubeSamplingService(CubeSamplingService cubeSamplingService) {
        this.cubeSamplingService = cubeSamplingService;
    }
    @GetMapping("/sample-cube")
    public List<Unit> sampleCube(Collection<Long> samplingUnitsIds , Collection<Double> inclusionProbabilities, DoubleSupplier randomFunction, int dataOrder,boolean landingPhaseProgrammingMethod){
        return cubeSamplingService.sampleCube(samplingUnitsIds ,inclusionProbabilities, randomFunction,dataOrder,landingPhaseProgrammingMethod);
    }
}
