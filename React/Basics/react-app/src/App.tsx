import ListGroup from "./components/ListGroup";
import Message from "./Message";
import Alert from "./components/Alert";
import Button from "./components/Button";
import { useState } from "react";

// function App(){
//   const handleSelectItem = (item:string)=>{
//     console.log(item);
//   }
//   let items = ["New York", "San Francisco", "Los Angeles", "Las Vegas", "London", "Manchester"];

//   return <div><ListGroup items={items} heading='Cities' onSelectItem={handleSelectItem}/></div>;
// }

// export default App;

function App() {
  const [alertVisible, setAlertVisibility] = useState(false);

  return (
    <div>
      {alertVisible && <Alert onClose={()=> setAlertVisibility(false)}>My alert</Alert>}
      <Button color="primary" onClick={() => setAlertVisibility(true)}>
        My Button
      </Button>
    </div>
  );
}

export default App;
