using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Counter : MonoBehaviour
{
    bool runOnce;
    // Start is called before the first frame update
    void Start()
    {
        runOnce = false;
    }

    // Update is called once per frame
    void Update()
    {
        if(!runOnce)
        {
            findAll();
            runOnce = true;
        }
    }

    void findAll()
    {
        //var goArray = FindObjectsOfType(GameObject);
        var goArray = FindObjectsOfType<GameObject>();
        var doorList = new List<GameObject>();
        var roomList = new List<GameObject>();
        var agentList = new List<GameObject>();

        for (var i = 0; i < goArray.Length; i++) 
        {
            if (goArray[i].layer == 11) //door = 11
            {
                doorList.Add(goArray[i]);
            }
            else if (goArray[i].layer == 10) //room = 10
            {
                roomList.Add(goArray[i]);
                Debug.Log(goArray[i].GetComponent<Renderer>().bounds.min.x+" "+goArray[i].GetComponent<Renderer>().bounds.max.x);
                Debug.Log(goArray[i].GetComponent<Renderer>().bounds.min.z+" "+goArray[i].GetComponent<Renderer>().bounds.max.z);
                Debug.Log(goArray[i].GetComponent<Renderer>().bounds.min.y+" "+goArray[i].GetComponent<Renderer>().bounds.max.y);

                // goArray[i].GetComponent<Renderer>().bounds.min.y;
                // goArray[i].GetComponent<Renderer>().bounds.max.y;
            }
            else if (goArray[i].layer == 8) //agent = 8
            {
                agentList.Add(goArray[i]);
            }
            else
            {

            }
        }

        if (doorList.Count == 0) 
        {
             Debug.Log("No Doors");
        }
        if (roomList.Count == 0) 
        {
            Debug.Log("No Rooms");
        }
        if (agentList.Count == 0) 
        {
            Debug.Log("No Agents");
        }

        Debug.Log("doors: "+doorList.Count+" rooms: "+roomList.Count+" agents: "+agentList.Count);
    }
}
