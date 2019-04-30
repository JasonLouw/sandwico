using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.AI;

public class AgentController : MonoBehaviour
{
    public NavMeshAgent agent;
    // Start is called before the first frame update
    void Start()
    {
        
         agent.SetDestination(GameObject.FindWithTag("door1").transform.position);
        // agent.destination = new Vector3(1,1,1);
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
